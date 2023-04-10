package org.example;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;



public class EquationSolverTest  {

    @Test
    public void testGetMax() {
        SquareEquation equation = new SquareEquation(3, -14, -5);
        EquationSolver solver = new EquationSolver(equation);

        assertEquals(5.0, solver.getMax());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetException() {
        SquareEquation equation = new SquareEquation(1, 6, 14);
        EquationSolver solver = new EquationSolver(equation);
        solver.getMax();
    }
}