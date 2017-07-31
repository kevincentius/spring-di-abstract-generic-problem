package main.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import main.SpringComponentScanMarker;

@Configuration
@ComponentScan(basePackageClasses = { SpringComponentScanMarker.class })
public class ApplicationContextConfig {

}
