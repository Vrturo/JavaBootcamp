package com.codefellows;

import sun.plugin2.os.windows.Windows;

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

        ICache<Window> cache = new ObjectCache<>();

        int x = 5;
        Integer y = 5;

    }
}
