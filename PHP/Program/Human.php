<?php

class Human
{
    private $name;
    private $id;
    private $partai;
    private $bidang;
    private $gambar; 

    public function __construct($name = "", $id = "", $partai = "", $bidang = "", $gambar = "dummy.jpg")
    {
        $this->name = $name;
        $this->id = $id;
        $this->partai = $partai;
        $this->bidang = $bidang;
        $this->gambar = $gambar;
    }

    public function get_name()
    {
        return $this->name;
    }

    public function set_name($name)
    {
        $this->name = $name;
    }

    public function get_id()
    {
        return $this->id;
    }

    public function set_id($id)
    {
        $this->id = $id;
    }

    public function get_partai()
    {
        return $this->partai;
    }

    public function set_partai($partai)
    {
        $this->partai = $partai;
    }

    public function get_bidang()
    {
        return $this->bidang;
    }

    public function set_bidang($bidang)
    {
        $this->bidang = $bidang;
    }

    public function get_gambar()
    {
        return $this->gambar;
    }

    public function set_gambar($gambar)
    {
        $this->gambar = $gambar;
    }

    public function __destruct()
    {
        
    }
}

?>