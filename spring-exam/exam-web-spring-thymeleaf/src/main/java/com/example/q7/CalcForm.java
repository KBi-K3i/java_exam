package com.example.q7;

import jakarta.validation.constraints.NotBlank;

// q7はできなかった。
public class CalcForm {
	@NotBlank(message = "値を入力してください")
	private String left;

	@NotBlank(message = "値を入力してください")
	private String right;
	
	public String getLeft() {
		return left;
	}
	public void setLeft(String left) {
		this.left = left;
	}
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
}
