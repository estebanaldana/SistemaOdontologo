package com.example.dante_000.sistemadientes;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Created by dante_000 on 17/11/2016.
 */

public class DocumentoPDF extends PdfPageEventHelper{


    private Image imagen;
    PdfPTable table = new PdfPTable(2);

    public DocumentoPDF()
    {
        try
        {
            PdfPCell celda1 = new PdfPCell(new Phrase("Universidad Nacional Autonoma de México"));
            PdfPCell celda2 = new PdfPCell(new Phrase("Odontología"));

            imagen = Image.getInstance("mipmap-xxhdpi/icono.png");
            imagen.setAbsolutePosition(10, 650f);

            celda1.setBorder(Rectangle.BOTTOM);
            celda2.setBorder(Rectangle.BOTTOM);
            celda2.setBorder(Rectangle.BOTTOM | Rectangle.RIGHT);

            table.addCell(celda1);
            table.addCell(celda2);

            table.setTotalWidth(350f);

        }catch(Exception r)
        {
            System.err.println("Error al leer la imagen");
        }
    }

    public void onEndPage(PdfWriter writer, Document document) {

        try{
            document.add(imagen);
            table.writeSelectedRows(0, -1, 140f, 700f, writer.getDirectContent());

        }catch(Exception doc)
        {
            doc.printStackTrace();
        }
    }

}
