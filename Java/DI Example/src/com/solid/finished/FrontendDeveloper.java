package com.solid.finished;

public class FrontendDeveloper implements Developer {

    @Override
    public void develop() {
        writeJavaScript();
    }

    public void writeJavaScript() {
        System.out.println("writing JavaScript");
    }

}
