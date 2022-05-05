package br.com.alura.java.io.teste;

import java.io.*;
//copia o lorem.txt pra dentro do lorem2
public class TesteCopiarFile {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null) {
            bw.write(linha); //escreve no novo arquivo, mas sem quebrar linhas
            bw.newLine(); //metodo quebra linha
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}