#include <iostream>
#include <cmath>
using namespace std;

class Shape {
protected:
    double width;
    double height;

public:
    Shape(double w = 0.0, double h = 0.0) : width(w), height(h) {
        cout << "Shape created with width = " << width 
             << ", height = " << height << endl;
    }

    void setWidth(double w)  { width = w; }
    void setHeight(double h) { height = h; }

    double getWidth() const  { return width; }
    double getHeight() const { return height; }

    virtual double calculateArea() const {
        return width * height;
    }

    virtual void display() const {
        cout << "Shape - Width: " << width << ", Height: " << height 
             << ", Area: " << calculateArea() << endl;
    }

    virtual ~Shape() = default;
};

class Circle : public Shape {
private:
    const double radius;

    static constexpr double PI = 3.14159265359;

public:
    explicit Circle(double r) : Shape(0, 0), radius(r) {
        cout << "Circle created with radius = " << radius << endl;
    }

    double getRadius() const { return radius; }

    double calculateArea() const override {
        return PI * radius * radius;
    }

    void display() const override {
        cout << "Circle - Radius: " << radius 
             << ", Area: " << calculateArea() << endl;
    }
};

int main() {
    cout << "=== Single Inheritance Demo ===\n\n";

    // Create a rectangle-like shape
    Shape rectangle(10, 5);
    rectangle.display();

    cout << endl;

    Circle circle(7.0);
    circle.display();

    cout << endl;

    cout << "Polymorphism using Shape* pointer:\n";
    Shape* ptr1 = &rectangle;
    Shape* ptr2 = &circle;

    ptr1->display();
    ptr2->display();

    cout << "\nTrying to change radius? IMPOSSIBLE!\n";

    return 0;
}