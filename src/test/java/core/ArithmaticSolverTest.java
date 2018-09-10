package core;

import junit.framework.TestCase;

public class ArithmaticSolverTest extends TestCase{
	public void testAdd() {
		ArithmaticSolver solver = new ArithmaticSolver();
		
		assertEquals(4, solver.add(2,2));
		
	}
	
	public void testSubtract() {
		ArithmaticSolver solver = new ArithmaticSolver();
		assertEquals(2, solver.subtract(4,2));
	}
	
	public void testMultiply() {
		ArithmaticSolver solver = new ArithmaticSolver();
		assertEquals(16, solver.multiply(8,2));
	}
	
	public void testDivide() {
		ArithmaticSolver solver = new ArithmaticSolver();
		assertEquals(3, solver.divide(9,3));
	}
	
	public void testModulus() {
		ArithmaticSolver solver = new ArithmaticSolver();
		assertEquals(1, solver.modulus(5,2));
	}
}
