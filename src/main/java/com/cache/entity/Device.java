package com.cache.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Device implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int id;
	private String Device_Name;
	private String Device_Type;
	private double price;
}
