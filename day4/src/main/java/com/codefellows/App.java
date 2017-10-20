package com.codefellows;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IWindow window = new WindowDecorator(new Window());
        window.minimize();

        System.out.println( "Hello World!" );
    }
}
