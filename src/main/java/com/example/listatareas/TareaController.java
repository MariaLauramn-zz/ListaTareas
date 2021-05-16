package com.example.listatareas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TareaController {

    private List<tarea> lista;

    public TareaController() { lista = new ArrayList<>();}

    @GetMapping("/lista")
    public List<tarea> todas() {
        return lista;
    }

    @PostMapping("/lista")
    public RedirectView addNewTarea(tarea param) {
        lista.add(param);
        return new RedirectView("/"); //devuelve la misma vista por defecto
    }
}