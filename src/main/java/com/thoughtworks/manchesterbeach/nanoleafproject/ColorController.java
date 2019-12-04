package com.thoughtworks.manchesterbeach.nanoleafproject;

import com.thoughtworks.manchesterbeach.nanoleafproject.model.Color;
import io.github.rowak.nanoleafapi.Aurora;
import io.github.rowak.nanoleafapi.StatusCodeException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {

    private Aurora aurora;

    public ColorController(Aurora aurora) {
        this.aurora = aurora;
    }

    @PostMapping("/RGBColor")
    public String setRGBColor(@RequestBody Color color) throws StatusCodeException {
        aurora.effects().fadeToColor(color.getR(), color.getG(), color.getB(), 3);
        System.out.println(color);
        return ":)";
    }

}
