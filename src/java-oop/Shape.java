class Shape {
    
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {

    int getCorner() {
        return 4;
    }
    
    // kalau mau akses parent class gunakan super keyword
    int getParentCorner() {
        return super.getCorner();
    }
}