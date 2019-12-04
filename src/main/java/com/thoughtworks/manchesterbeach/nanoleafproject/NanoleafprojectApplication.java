package com.thoughtworks.manchesterbeach.nanoleafproject;

import io.github.rowak.nanoleafapi.Aurora;
import io.github.rowak.nanoleafapi.Panel;
import io.github.rowak.nanoleafapi.StatusCodeException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class NanoleafprojectApplication {

	public static void main(String[] args) throws StatusCodeException, InterruptedException {
		ApplicationContext ctx =  SpringApplication.run(NanoleafprojectApplication.class, args);

		Aurora myAurora = (Aurora)ctx.getBean("getAuroraObject");
		myAurora.state().fadeToBrightness(100,2);

		List<Panel> panels = Arrays.asList(myAurora.panelLayout().getPanels());
		Collections.reverse(panels);
		for(Panel panel : panels) {
			Thread.sleep(1000);
			myAurora.effects().setPanelColor(panel, 0,255,0, 3);
		}

	}
}
