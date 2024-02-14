<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table {
            border-collapse: collapse;
        }

        table, th, td {
            border: 1px solid black;
        }

        th, td {
            padding: 5px;
            text-align: left;
        }
    </style>
</head>
<body>
    <?php
    require ('Human.php');

    $anggotaDPR = array(
        array("Komeng", "1101313", "Non Partai", "Komisi 1", "dummy.jpg"),
        array("Abdul", "2101313", "Golkar", "Komisi 2", "dummy.jpg"),
        array("Asep", "3101313", "PDIP", "Komisi 3", "dummy.jpg"),
        array("Yanti", "4101313", "Nasdem", "Komisi 4", "dummy.jpg"),
        array("Siti", "5101313", "Demokrat", "Komisi 5", "dummy.jpg")
    );

    $human = array();

    foreach ($anggotaDPR as $data) {
        $human = new Human(...$data);
        $humans[] = $human;
    }

    echo "<h3>Daftar Anggota DPR</h3>";
    echo "<table>";
    echo "<tr>
            <th>Name</th>
            <th>ID</th>
            <th>Partai</th>
            <th>Bidang</th>
            <th>Gambar</th>
          </tr>";

    foreach ($humans as $human) {
        echo "<tr>";
        echo "<td>" . $human->get_name() . "</td>";
        echo "<td>" . $human->get_id() . "</td>";
        echo "<td>" . $human->get_partai() . "</td>";
        echo "<td>" . $human->get_bidang() . "</td>";
        echo "<td><img src='" . $human->get_gambar() . "' alt='Image not found'style='width: 20px; height: 20px';></td>";
        echo "</tr>";
    }
    echo "</table>";
    echo"<br>";

    echo "<em>Anggota dengan ID 3101313 berhasil diubah</em>";
    foreach ($humans as $human) {
        if ($human->get_id() == "3101313") {
            $human->set_id("4444444");
        }
    }
    echo "<h3>Daftar Anggota DPR</h3>";
    echo "<table>";
    echo "<tr>
            <th>Name</th>
            <th>ID</th>
            <th>Partai</th>
            <th>Bidang</th>
            <th>Gambar</th>
          </tr>";

    foreach ($humans as $human) {
        echo "<tr>";
        echo "<td>" . $human->get_name() . "</td>";
        echo "<td>" . $human->get_id() . "</td>";
        echo "<td>" . $human->get_partai() . "</td>";
        echo "<td>" . $human->get_bidang() . "</td>";
        echo "<td><img src='" . $human->get_gambar() . "' alt='Image not found'style='width: 20px; height: 20px';></td>";
        echo "</tr>";
    }
    echo "</table>";
    echo"<br>";

    echo "<em>Anggota dengan ID 4444444 berhasil dihapus</em>";

    foreach ($humans as $key => $human) {
        if ($human->get_id() == "4444444") {
            unset($humans[$key]);
        }
    }

    echo "<h3>Daftar Anggota DPR</h3>";
    echo "<table>";
    echo "<tr>
            <th>Name</th>
            <th>ID</th>
            <th>Partai</th>
            <th>Bidang</th>
            <th>Gambar</th>
          </tr>";

    foreach ($humans as $human) {
        echo "<tr>";
        echo "<td>" . $human->get_name() . "</td>";
        echo "<td>" . $human->get_id() . "</td>";
        echo "<td>" . $human->get_partai() . "</td>";
        echo "<td>" . $human->get_bidang() . "</td>";
        echo "<td><img src='" . $human->get_gambar() . "' alt='Image not found'style='width: 20px; height: 20px';></td>";
        echo "</tr>";
    }
    echo "</table>";
    echo"<br>";

    ?>  
</body>
</html>

