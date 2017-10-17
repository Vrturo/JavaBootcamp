package com.codefellows;

import com.codefellows.admintools.CourseManager;
import com.codefellows.admintools.StudentManager;
import com.codefellows.admintools.anotherpackage.SomethingElse;
import com.google.MailService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MailService ms = new MailService();

        CourseManager cm = new CourseManager();
        StudentManager sm = new StudentManager();

        SomethingElse se = new SomethingElse();
    }
}
