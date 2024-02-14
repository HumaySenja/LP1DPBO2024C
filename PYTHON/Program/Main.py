from Human import Human

def printAnggotaDPR(humanList):
    panjangnama = 0
    panjangid = 0
    panjangpartai = 0
    panjangbidang = 0
    for i in range(len(humanList)):
        if len(humanList[i].get_name()) > panjangnama:
            panjangnama = len(humanList[i].get_name())
        if len(humanList[i].get_id()) > panjangid:
            panjangid = len(humanList[i].get_id())
        if len(humanList[i].get_partai()) > panjangpartai:
            panjangpartai = len(humanList[i].get_partai())
        if len(humanList[i].get_bidang()) > panjangbidang:
            panjangbidang = len(humanList[i].get_bidang())
    panjangsemua = panjangnama + panjangid + panjangpartai + panjangbidang

    print("\nDaftar Anggota DPR")
    for i in range(panjangsemua + 17):
        print("-", end="")
    print()
    for i in range(len(humanList)):
        print("| " + str(i + 1) + " | ", end="")
        print(humanList[i].get_name(), end="")
        for j in range(panjangnama - len(humanList[i].get_name())):
            print(" ", end="")
        print(" | ", end="")
        print(humanList[i].get_id(), end="")
        for j in range(panjangid - len(humanList[i].get_id())):
            print(" ", end="")
        print(" | ", end="")
        print(humanList[i].get_partai(), end="")
        for j in range(panjangpartai - len(humanList[i].get_partai())):
            print(" ", end="")
        print(" | ", end="")
        print(humanList[i].get_bidang(), end="")
        for j in range(panjangbidang - len(humanList[i].get_bidang())):
            print(" ", end="")
        print(" |")
    for k in range(panjangsemua + 17):
        print("-", end="")
    print()


def main():
    humanList = []

    print("Ketikan jumlah anggota DPR yang mau diinput")
    n = int(input())
    for i in range(n):
        temp = Human()

        print("Ketikan nama, id, partai dan bidang:")
        name = input()
        id = input()
        partai = input()
        bidang = input()

        temp.set_name(name)
        temp.set_id(id)
        temp.set_partai(partai)
        temp.set_bidang(bidang)

        humanList.append(temp)

    printAnggotaDPR(humanList)

    pilihan = 0
    while pilihan != 4:
        print("\n1. Tambah Anggota DPR")
        print("2. Update Anggota DPR")
        print("3. Hapus Anggota DPR")
        print("4. End program")
        print("Ketikan pilihan:")

        pilihan = int(input())

        if pilihan == 1:
            print("Ketikan jumlah anggota DPR yang mau diinput")
            n = int(input())
            print("Ketikan nama, id, partai dan bidang:")
            for i in range(n):
                temp = Human()

                name = input()
                id = input()
                partai = input()
                bidang = input()

                temp.set_name(name)
                temp.set_id(id)
                temp.set_partai(partai)
                temp.set_bidang(bidang)

                humanList.append(temp)

        elif pilihan == 2:
            print("Ketikan indeks anggota DPR yang mau diubah:")
            indexToUpdate = int(input())
            print("Ketikan nama, id, partai dan bidang yang baru:")
            name = input()
            id = input()
            partai = input()
            bidang = input()

            humanList[indexToUpdate - 1].set_name(name)
            humanList[indexToUpdate - 1].set_id(id)
            humanList[indexToUpdate - 1].set_partai(partai)
            humanList[indexToUpdate - 1].set_bidang(bidang)

        elif pilihan == 3:
            print("Ketikan indeks anggota DPR yang mau dihapus:")
            indexToRemove = int(input())

            if indexToRemove >= 1 and indexToRemove <= len(humanList):
                humanList.pop(indexToRemove - 1)
                print("Anggota tersebut berhasil dihapus.")
            else:
                print("indeks tidak ditemukan")

        elif pilihan == 4:
            break

        else:
            print("masukkan tidak valid")

        if pilihan != 4:
            printAnggotaDPR(humanList)


if __name__ == "__main__":
    main()
