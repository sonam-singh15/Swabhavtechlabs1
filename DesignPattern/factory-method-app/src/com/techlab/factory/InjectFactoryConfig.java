package com.techlab.factory;

import java.util.Map;

public class InjectFactoryConfig {
	private IConfigLoader configLoader;
	private String configPath;
	private Map<String, String> config;
	private Class<?> factoryClass;

	public InjectFactoryConfig() {
		this(new ProperitesLoader(),
				"C:\\Users\\Swabhav\\Documents\\ss\\Swabhavtechlabs1\\DesignPattern\\factory-method-app\\src\\com\\techlab\\factory\\Factory.properties");
	}

	public InjectFactoryConfig(IConfigLoader configLoader, String configPath) {
		this.setConfigLoader(configLoader);
		this.setConfigPath(configPath);
		this.loadPropertyData();
	}

	public void setConfigLoader(IConfigLoader configLoader) {
		this.configLoader = configLoader;
	}

	public void setConfigPath(String path) {
		this.configPath = path;
	}

	public void loadPropertyData() {
		this.config = this.configLoader.loadconfig(this.configPath);
		setFactoryClass();
	}

	private void setFactoryClass() {
		this.factoryClass = Reflector.getClass(config.get("factory.name"));
		if (this.factoryClass == null)
			this.factoryClass = BMWFactory.class;
	}

	public IAutoFactory getFactory() {
		IAutoFactory factory = (IAutoFactory) Reflector.invokeStaticMethod(this.factoryClass, "getInstance");
		if (factory == null)
			return BMWFactory.getInstance();
		return factory;
	}
}