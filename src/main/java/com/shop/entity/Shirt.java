package com.shop.entity;

public class Shirt {
	private String id;
	private String name;
	private Color color;
	private Size size;
	private int quantity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public enum Color {
		BLACK, WHITE, BLUE, NAVYBLUE, SKYBLUE, PURPLE
	}

	public enum Size {
		XS, S, L, XL, M
	}
}
