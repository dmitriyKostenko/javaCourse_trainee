package ru.job4j.stragery;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   +   ");
        pic.append(System.getProperty("line.separator"));
        pic.append("  +++  ");
        pic.append(System.getProperty("line.separator"));
        pic.append(" +++++ ");
        pic.append(System.getProperty("line.separator"));
        pic.append("+++++++");
        return pic.toString();
    }
}
