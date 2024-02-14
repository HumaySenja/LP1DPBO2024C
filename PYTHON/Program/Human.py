class Human:
    def __init__(self, name="", id="", partai="", bidang=""):
        self.name = name
        self.id = id
        self.partai = partai
        self.bidang = bidang

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_partai(self):
        return self.partai

    def set_partai(self, partai):
        self.partai = partai

    def get_bidang(self):
        return self.bidang

    def set_bidang(self, bidang):
        self.bidang = bidang