package com.example.dante_000.sistemadientes;



public class ClassDientes {

    public Double[][] H = new Double[16][2];
    public Double[][] M = new Double[16][2];

    public void iniciar()
    {
        //M-D CanSup
        M[0][0] = 7.06;
        M[0][1] = 8.53;
        //V-L CanSup
        M[1][0] = 6.46;
        M[1][1] = 9.05;
        //DV-ML CanSup
        M[2][0] = 7.21;
        M[2][1] = 7.73;
        //DL-MV CanSup
        M[3][0] = 7.23;
        M[3][1] = 7.75;

        //M-D PimMolSup
        M[4][0] = 8.19;
        M[4][1] = 11.1;
        //V-L PimMolSup
        M[5][0] = 9.13;
        M[5][1] = 11.23;
        //DV-ML PimMolSup
        M[6][0] = 11.52;
        M[6][1] = 12.46;
        //DL-MV PimMolSup
        M[7][0] = 12.22;
        M[7][1] = 12.81;

        //M-D CanInf
        M[8][0] = 5.82;
        M[8][1] = 8.02;
        //V-L CanInf
        M[9][0] = 6.62;
        M[9][1] = 7.48;
        //DV-ML CanInf
        M[10][0] = 6.42;
        M[10][1] = 6.95;
        //DL-MV CanInf
        M[11][0] = 7.19;
        M[11][1] = 7.72;

        //M-D PrimMolInf
        M[12][0] = 9.7;
        M[12][1] = 12.01;
        //V-L PrimMolInf
        M[13][0] = 9.39;
        M[13][1] = 10.73;
        //DV-ML PrimMolInf
        M[14][0] = 11.17;
        M[14][1] = 11.64;
        //DL-MV PrimMolInf
        M[15][0] = 11.32;
        M[15][1] = 11.84;

        // **********************

        //M-D CanSup
        H[0][0] = 7.55;
        H[0][1] = 8.42;
        //V-L CanSup
        H[1][0] = 7.63;
        H[1][1] = 8.32;
        //DV-ML CanSup
        H[2][0] = 7.62;
        H[2][1] = 8.18;
        //DL-MV CanSup
        H[3][0] = 8.32;
        H[3][1] = 8.91;

        //M-D PimMolSup
        H[4][0] = 11.57;
        H[4][1] = 12.49;
        //V-L PimMolSup
        H[5][0] = 11.14;
        H[5][1] = 11.74;
        //DV-ML PimMolSup
        H[6][0] = 11.53;
        H[6][1] = 12.37;
        //DL-MV PimMolSup
        H[7][0] = 11.51;
        H[7][1] = 13.32;


        //M-D CanInf
        H[8][0] = 7.54;
        H[8][1] = 7.76;
        //V-L CanInf
        H[9][0] = 7.55;
        H[9][1] = 8.42;
        //DV-ML CanInf
        H[10][0] = 6.82;
        H[10][1] = 7.41;
        //DL-MV CanInf
        H[11][0] = 7.68;
        H[11][1] = 8.34;

        //M-D PrimMolInf
        H[12][0] = 11.52;
        H[12][1] = 12.18;
        //V-L PrimMolInf
        H[13][0] = 10.47;
        H[13][1] = 11.31;
        //DV-ML PrimMolInf
        H[14][0] = 11.58;
        H[14][1] = 12.00;
        //DL-MV PrimMolInf
        H[15][0] = 11.11;
        H[15][1] = 12.31;
    }


}


