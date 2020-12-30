package lab_5;

import lab_5.fractals.Mandelbrot;

public class Main
{
    public static void main(String[] args)
    {
        FractalGenerator gen = new Mandelbrot();

        FractalExplorer exp = new FractalExplorer(800, 800, gen);
        exp.createAndShowGui();
    }
}