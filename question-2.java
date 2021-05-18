public static void main(String[] args) throws Exception {
        String string = "I am what I am hhhhhhhhhhhhhhhhhhhhhhhhhhhhh"
                + "bjggujhhhhhhhhh"
                + "rggggggggggggggggggggggggg"
                + "esfffffffffffffffffffffffffffffff"
                + "esffffffffffffffffffffffffffffffff"
                + "esfekfgy enter code here`etd`enter code here wdd"
                + "heljwidgutwdbwdq8d"
                + "skdfgysrdsdnjsvfyekbdsgcu"
                +"jbujsbjvugsduddbdj";

       System.out.println("after compress:");
        String compressed = compress(string);
        System.out.println(compressed);
        System.out.println("after decompress:");
        String decomp = decompress(compressed);
        System.out.println(decomp);
    }


     public static String compress(String str) throws Exception {
        if (str == null || str.length() == 0) {
            return str;
        }
        System.out.println("String length : " + str.length());
        ByteArrayOutputStream obj=new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(obj);
        gzip.write(str.getBytes("UTF-8"));
        gzip.close();
        String outStr = obj.toString("UTF-8");
        System.out.println("Output String length : " + outStr.length());
        return outStr;
     }

      public static String decompress(String str) throws Exception {
        if (str == null || str.length() == 0) {
            return str;
        }
        System.out.println("Input String length : " + str.length());
        GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(str.getBytes("UTF-8")));
        BufferedReader bf = new BufferedReader(new InputStreamReader(gis, "UTF-8"));
        String outStr = "";
        String line;
        while ((line=bf.readLine())!=null) {
          outStr += line;
        }
        System.out.println("Output String lenght : " + outStr.length());
        return outStr;
     }