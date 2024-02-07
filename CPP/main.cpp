#include <bits/stdc++.h>
#include "Human.cpp"

using namespace std;

int main()
{
    int i, n = 0;
    string name;
    string id;
    string partai;
    string bidang;

    vector<Human> vvector;

    cin >> n;
    for (i = 0; i < n; i++)
    {
        Human temp;

        cin >> name >> id >> partai >> bidang;

        temp.set_name(name);
        temp.set_id(id);
        temp.set_partai(partai);
        temp.set_bidang(bidang);

        vvector.push_back(temp);
    }

    cout << "Daftar Anggota DPR : " << '\n';
    for (i = 0; i < vvector.size(); i++)
    {
        cout << (i + 1) << ". " << vvector[i].get_name() << "|" << vvector[i].get_id()
             << "|" << vvector[i].get_partai() << "|" << vvector[i].get_bidang() << '\n';
    }

    int input = 0;
    do
    {
        cout << '\n'
             << "1. menambah daftar anggota dpr" << '\n';
        cout << "2. merubah daftar anggota dpr" << '\n';
        cout << "3. menghapus daftar anggota dpr" << '\n';
        cout << "4. end program" << '\n';
        cout << "masukkan angka yang anda pilih" << '\n';
        cin >> input;

        switch (input)
        {
        case 1:
            cout << "berapa anggota yang mau dimasukkan kedalam list?\n";
            cin >> n;
            cout << "masukkan nama, id, partai, bidang\n";
            for (i = 0; i < n; i++)
            {
                Human temp;

                cin >> name >> id >> partai >> bidang;

                temp.set_name(name);
                temp.set_id(id);
                temp.set_partai(partai);
                temp.set_bidang(bidang);

                vvector.push_back(temp);
            }
            break;

        case 2:
            int indeksubah;
            cout << "Masukkan indeks anggota yang ingin diubah:\n";
            cin >> indeksubah;
            cout << "masukkan nama, id, partai, bidang yang baru\n";
            cin >> name >> id >> partai >> bidang;

            vvector[indeksubah-1].set_name(name);
            vvector[indeksubah-1].set_id(id);
            vvector[indeksubah-1].set_partai(partai);
            vvector[indeksubah-1].set_bidang(bidang);
            break;

        case 3:
            int indekshapus;
            cout << "Masukkan indeks anggota yang ingin dihapus:\n";
            cin >> indekshapus;

            if (indekshapus >= 1 && indekshapus <= vvector.size())
            {
                vvector.erase(vvector.begin() + indekshapus - 1);
                cout << "Anggota berhasil dihapus.\n";
            }
            else
            {
                cout << "Indeks tidak valid.\n";
            }
            break;

        case 4:

            break;

        default:
            cout << "masukkan invalid\n";
            break;
        }
        cout << "Daftar Anggota DPR : " << '\n';
        for (i = 0; i < vvector.size(); i++)
        {
            cout << (i + 1) << ". " << vvector[i].get_name() << "|" << vvector[i].get_id()
                 << "|" << vvector[i].get_partai() << "|" << vvector[i].get_bidang() << '\n';
        }
    } while (input != 4);

    return 0;
}