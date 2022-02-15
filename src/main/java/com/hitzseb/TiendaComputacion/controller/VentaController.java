package com.hitzseb.TiendaComputacion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.hitzseb.TiendaComputacion.model.Sucursal;
import com.hitzseb.TiendaComputacion.model.Vendedor;
import com.hitzseb.TiendaComputacion.model.Componente;
import com.hitzseb.TiendaComputacion.model.Venta;
import com.hitzseb.TiendaComputacion.service.IComponenteService;
import com.hitzseb.TiendaComputacion.service.ISucursalService;
import com.hitzseb.TiendaComputacion.service.IVendedorService;
import com.hitzseb.TiendaComputacion.service.IVentaService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
public class VentaController {

    @Autowired
    public IVentaService ventaService;
    @Autowired
    public IVendedorService vendedorService;
    @Autowired
    public ISucursalService sucursalService;
    @Autowired
    public IComponenteService componenteService;

    @GetMapping("/ventas")
    @ResponseBody
    public List<Venta> getVentas() {
        return ventaService.showVentas();
    }

    @PostMapping("/venta")
    public void createVenta(@RequestBody Venta venta) {
        Vendedor vendedor = venta.getVendedor();
        Sucursal sucursal = venta.getSucursal();
        float total = 0;
        float ventasVendedor = vendedor.getVentas();
        float ventasSucursal = sucursal.getVentas();
        String lista = "";
        char[] listaDeComponentes = venta.getComponentes().toCharArray();
        for (char c : listaDeComponentes) {
            Componente componente = componenteService.findComponente(c - '0');
            componente.setVentas(componente.getVentas()+1);
            componenteService.saveComponente(componente);
            lista += (componente.getNombre())+"-";
            total += componenteService.findComponente(c - '0').getPrecio();
        }
        venta.setLista(lista);
        venta.setTotal(total);
        ventaService.saveVenta(venta);
        ventasVendedor += total;
        vendedor.setVentas(ventasVendedor);
        vendedorService.saveVendedor(vendedor);
        ventasSucursal += total;
        sucursal.setVentas(ventasSucursal);
        sucursalService.saveSucursal(sucursal); 
    }

    @DeleteMapping("/ventas/{id}")
    public void deleteVenta(@PathVariable int id) {
        Venta venta = ventaService.findVenta(id);
        Sucursal sucursal = venta.getSucursal();
        Vendedor vendedor = venta.getVendedor();
        float total = 0;
        float ventasSucursal = sucursal.getVentas();
        float ventasVendedor = vendedor.getVentas();
        char[] listaDeComponentes = venta.getComponentes().toCharArray();
        for (char c : listaDeComponentes) {
            Componente componente = componenteService.findComponente(c - '0');
            componente.setVentas(componente.getVentas()-1);
            componenteService.saveComponente(componente);
            total += componenteService.findComponente(c - '0').getPrecio();
        }
        ventaService.deleteVenta(id);
        ventasVendedor -= total;
        vendedor.setVentas(ventasVendedor);
        vendedorService.saveVendedor(vendedor);
        ventasSucursal -= total;
        sucursal.setVentas(ventasSucursal);
        sucursalService.saveSucursal(sucursal);
    }
    
}