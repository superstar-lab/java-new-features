package com.github.wesleyegberto.calculator;

// must be public and exported (at module-info)
import com.github.wesleyegberto.mathlib.*;

public class SimpleCalculator {
	public static void main(String[] args) {
		MathIntegerOperations math = new MathIntegerOperations();
		System.out.println(math);

		Operation<Integer, Integer> add = math.getAdditionOperation();
		System.out.println(add);

		Integer result = add.apply(2, 5);
		System.out.println(result);
	}

}