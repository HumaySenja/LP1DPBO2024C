#include <iostream>
#include <string>

using namespace std;

class Human
{
    private:
        string name;
        string id;
        string partai;
        string bidang;

    public:

        Human(){
            this->name = "";
            this->id = "";
            this->partai = "";
            this->bidang = "";
        }

        Human(string name, string id, string partai, string bidang)
        {
            this->name = name;
            this->id = id;
            this->partai = partai;
            this->bidang = bidang;
        }

        string get_name(){
            return this->name;
        }

        void set_name(string name)
        {
            this->name = name;
        }

        string get_id(){
            return this->id;
        }

        void set_id(string id)
        {
            this->id = id;
        }

        string get_partai(){
            return this->partai;
        }

        void set_partai(string partai)
        {
            this->partai = partai;
        }

        string get_bidang(){
            return this->bidang;
        }

        void set_bidang(string bidang)
        {
            this->bidang = bidang;
        }

        void eat()
        {
            cout << this->name << "is eating!" << '\n';
        }

        ~Human(){

        }
};