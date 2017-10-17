package com.codefellows;

import java.util.ArrayList;

public class WebClient {
    private WebService ws;

    public WebClient(WebService ws) {
        this.ws = ws;
    }

    public ArrayList<Person> getAllPeople() {
        return ws.getAllPeople();
    }
}
