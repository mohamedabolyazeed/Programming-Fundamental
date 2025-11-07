// Author: Abolyazeed
#include <iostream>
#include <vector>
#include <string>

using namespace std;

class City
{
private:
  string cityName;

public:
  City(string name) : cityName(name) {}

  void setName(string name)
  {
    cityName = name;
  }

  string getName() const
  {
    return cityName;
  }

  void display(int cityNumber) const
  {
    cout << "City-" << cityNumber << ": " << cityName << endl;
  }
};

class State
{
private:
  string stateName;
  vector<City> cities;

public:
  State(string name) : stateName(name) {}

  void addCity(const City &city)
  {
    cities.push_back(city);
  }

  void display(int stateNumber) const
  {
    cout << "State-" << stateNumber << ": " << stateName << endl;
    int cityNumber = 1;
    for (const auto &city : cities)
    {
      city.display(cityNumber++);
    }
  }
};

class Country
{
private:
  string countryName;
  vector<State> states;

public:
  Country(string name) : countryName(name) {}

  void addState(const State &state)
  {
    states.push_back(state);
  }

  void display() const
  {
    cout << "Country: " << countryName << endl;
    int stateNumber = 1;
    for (const auto &state : states)
    {
      state.display(stateNumber++);
    }
  }
};

int main()
{
  Country country("Egypt");

  State state1("Sohag");
  State state2("Cairo");

  City city1("Arab Mahrous");
  City city2("Elzamalek");

  state1.addCity(city1);
  state2.addCity(city2);

  country.addState(state1);
  country.addState(state2);

  country.display();

  return 0;
}
