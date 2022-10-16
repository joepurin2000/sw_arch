package com.solid.lsp;

public class Square extends Rectangle {

    Square(int side) {
        super(side,side);
    }

    @Override
    public void setWidth(int width) {super.setSide(width);
    }

    @Override
    public void setHeight(int height) {
        super.setSide(height);
    }

    @Override
    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
        // super.setSide(side);
    }
}
