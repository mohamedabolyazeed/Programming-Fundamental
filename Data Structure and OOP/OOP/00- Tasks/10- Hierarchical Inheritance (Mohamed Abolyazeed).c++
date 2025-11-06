#include <iostream>
#include <string>
using namespace std;

class Car {
private:
    string maker;
    int model;
    string color;

public:
    Car(string m = "Unknown", int mo = 0, string c = "White")
        : maker(move(m)), model(mo), color(move(c)) 
    {
        cout << "A new Car has been created!\n\n";
    }

    void setMaker(string m)     { maker = move(m); }
    void setModel(int mo)       { model = mo; }
    void setColor(string c)     { color = move(c); }

    string getMaker() const     { return maker; }
    int getModel() const        { return model; }
    string getColor() const     { return color; }

    void print() const {
        cout << "=== Car Details ===\n";
        cout << "Maker : " << maker << endl;
        cout << "Model : " << model << endl;
        cout << "Color : " << color << "\n\n";
    }
};

int main() {
    cout << "Car Management System\n";
    cout << string(30, '-') << "\n\n";

    Car c1("Honda", 2020, "Black");

    c1.print();

    c1.setMaker("Toyota");
    c1.setModel(2023);
    c1.setColor("Red");

    cout << "After modification:\n";
    c1.print();

    Car c2;
    c2.setMaker("BMW");
    c2.setModel(2025);
    c2.setColor("Silver");
    c2.print();

    return 0;
}