package org.selenium.pom.factory.abstractFactory;

import org.selenium.pom.constants.DriverType;


public class DriverManagerFactoryAbstract {
    public static DriverManagerAbstract getManager(DriverType driverType){
        switch (driverType){
            case CHROME -> {
                return new ChromeDriverManagerAbstract();
            }
            default -> throw new IllegalStateException("Invalid browser name: " + driverType);
        }
    }

}
