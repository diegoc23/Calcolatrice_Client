package com.cangelosi;

import java.net.*;
import java.util.zip.DataFormatException;
import java.io.*;

public class Client
{
    String nomeServer = "localhost";
    int portaServer = 1234;
    Socket miosocket ;
    BufferedReader tastiera;
    String stringaUtente;
    String stringaRicevutaDalServer;
    DataOutputStream outVersoServer;
    BufferedReader inDalServer;
}
