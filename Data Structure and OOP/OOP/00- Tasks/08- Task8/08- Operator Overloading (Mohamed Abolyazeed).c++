#include <iostream>
using namespace std;

class Fraction
{
private:
  int numerator;
  int denominator;

  void checkDenominator()
  {
    if (denominator == 0)
    {
      cout << "Error cannot zero" << endl;
      denominator = 1;
    }
  }

public:
  Fraction() : numerator(0), denominator(1) {}

  Fraction(int num, int denom) : numerator(num), denominator(denom)
  {
    checkDenominator();
  }

  void setNumerator(int num) { numerator = num; }
  int getNumerator() const { return numerator; }

  void setDenominator(int denom)
  {
    denominator = denom;
    checkDenominator();
  }
  int getDenominator() const { return denominator; }

  void print()
  {
    cout << numerator << "/" << denominator << endl;
  }

  Fraction operator+(Fraction F)
  {
    int newNumerator = numerator * F.denominator + F.numerator * denominator;
    int newDenominator = denominator * F.denominator;
    return Fraction(newNumerator, newDenominator);
  }

  Fraction operator-(Fraction F)
  {
    int newNumerator = numerator * F.denominator - F.numerator * denominator;
    int newDenominator = denominator * F.denominator;
    return Fraction(newNumerator, newDenominator);
  }

  Fraction operator*(Fraction F)
  {
    int newNumerator = numerator * F.numerator;
    int newDenominator = denominator * F.denominator;
    return Fraction(newNumerator, newDenominator);
  }

  Fraction operator/(Fraction F)
  {
    int newNumerator = numerator * F.denominator;
    int newDenominator = denominator * F.numerator;
    return Fraction(newNumerator, newDenominator);
  }

  bool operator==(Fraction F)
  {
    return numerator * F.denominator == F.numerator * denominator;
  }

  bool operator!=(Fraction F)
  {
    return !(*this == F);
  }
};

int main()
{
  Fraction n1, n2;
  int num, denom;

  cout << "Enter numerator first fraction: ";
  cin >> num;
  cout << "Enter denominator first fraction: ";
  cin >> denom;
  n1.setNumerator(num);
  n1.setDenominator(denom);

  cout << "Enter numerator second fraction: ";
  cin >> num;
  cout << "Enter denominator second fraction: ";
  cin >> denom;
  n2.setNumerator(num);
  n2.setDenominator(denom);

  cout << "First Fraction: ";
  n1.print();
  cout << "Second Fraction: ";
  n2.print();

  Fraction result;
  result = n1 + n2;
  cout << "Addition: ";
  result.print();

  result = n1 - n2;
  cout << "Subtraction: ";
  result.print();

  result = n1 * n2;
  cout << "Multiplication: ";
  result.print();

  result = n1 / n2;
  cout << "Division: ";
  result.print();

  cout << "fractions equal? " << (n1 == n2 ? "Yes" : "No") << endl;
  cout << "fractions not equal? " << (n1 != n2 ? "Yes" : "No") << endl;

  return 0;
}