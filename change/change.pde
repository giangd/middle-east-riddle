void setup() {
  String words = "Paphos Argaki Asinou Galata Giolou Kampia Kambos Kantou Kilani Kornos Latsia Paphos Maroni Meniko Melini Miliou Pachna Pegeia Pyrgos Sotira Sotira Tymvou";
  String[] list = split(words, ' ');
  saveStrings("test.txt", list);
}