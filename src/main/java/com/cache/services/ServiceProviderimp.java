package com.cache.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cache.entity.Device;
@Service
public class ServiceProviderimp implements ServiceProvider {
	private final List<Device> database= new ArrayList<>(List.of(new Device(100,"Samsung","Mobile Phone",70000.0D),
			new Device(101,"iphone","Mobile Phone",130000.0D),
			new Device(102,"Xiaomi","Mobile Phone",40000.0D),
			new Device(103,"Apply TV","Telivision",70000.0D),
			new Device(104,"Zebronics","Home Theater",15000.0D)));

	@Override
	public Map<String, Long> GetAllDevicesCatagory(String Device_Type) {
		return this.database.stream().filter(device->device.getDevice_Type().equalsIgnoreCase(Device_Type))
				.collect(Collectors.groupingBy(x->x.getDevice_Type().toString(),Collectors.counting()));

	}

	@Override
	public Map<String, Double> GetPriceOfDevice(String Device_Name) {
		return database.stream().filter(device ->device.getDevice_Name().equalsIgnoreCase(Device_Name))
				.collect(Collectors.toMap(Device::getDevice_Name, Device::getPrice));

	}

}
