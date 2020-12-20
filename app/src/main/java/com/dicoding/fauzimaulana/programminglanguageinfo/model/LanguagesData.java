package com.dicoding.fauzimaulana.programminglanguageinfo.model;

import com.dicoding.fauzimaulana.programminglanguageinfo.R;

import java.util.ArrayList;

public class LanguagesData {
    private static String[] languageName = {
            "Java",
            "C",
            "C++",
            "C#",
            "PHP",
            "Visual Basic",
            "Phyton",
            "JavaScript",
            "Kotlin",
            "Ruby"
    };

    private static String[] languageDetails = {
            "Java merupakan bahasa pemrograman yang dapat dijalankan di berbagai platform, dari mulai PC sampai perangkat mobile. Bahasa pemrograman ini awalnya dikembangkan pada The Green Project pada tahun 1991 oleh Sun Microsystem yang kemudian dilepas pada Oracle. Nama Java sendiri dipilih karena salah seorang pendiri Java, James Gosling, sangat menyukai kopi murni yang langsung digiling dari mesin giling (kopi tubruk) dimana kopi jenis ini berasal dari pulau Jawa di Indonesia.\n" +
                    "Java menjadi salah satu bahasa pemrograman terpopuler bukan karena tanpa alasan, bahasa pemrograman ini memiliki beberapa kelebihan seperti misalnya bisa berjalan di sistem operasi yang berbeda-beda, kemudian bahasa pemrograman ini termasuk kedalam pemrograman OOP (pemrograman orientasi objek) sehingga programer lebih mudah dalam menyusun program menggunakan bahasa ini, selain itu bahasa ini juga memiliki library yang lengkap sehingga akan sangat memudahkan programer. Dan saat ini merupakan era dimana smartphone Android sangat banyak digunakan. Aplikasi dalam smartphone Android dibangun menggunakan bahasa Java, sehingga banyak juga programer-programer yang menggunakan bahasa ini karena memang sedang banyak dibutuhkan.\n",
            "Bahasa C ini termasuk bahasa pemrograman tertua yang pernah ada. Bahasa pemrograman C ini dikembangkan dari sekitar tahun 70-an. Pembuat bahasa C adalah Dennis Ritchie. Bahasa C menjadi bahasa pemrograman yang populer di Indonesia karena hampir sebagian besar perguruan tinggi jurusan IT ataupun lembaga kursus pemrograman menggunakan bahasa ini untuk dipelajari pertama kali sebelum mempelajari bahasa pemrograman yang lain. Bukan tanpa sebab bahasa C ini menjadi dasar untuk mempelajari bahasa pemrograman yang lain, karena memang bahasa C ini merupakan \"bapak\" dari bahasa pemrograman lain seperi C#, Java, C++, dan lain sebagainya.",
            "C++ merupakan bahasa pemrograman pengembangan dari bahasa C. C++ dan C memiliki sintaks penulisan yang hampir sama, meski begitu kedua bahasa pemrograman ini memiliki perbedaan pada penyelesaian masalahnya. Pada bahasa C penyelesaian masalah dilakukan dengan membagi-bagi kedalam sub-sub masalah yang lebih kecil lagi atau bisa disebut bahasa pemrograman prosedural, sedangakan C++ berorientasi pada objek dimana permasalahan dibagi-bagi kedalam class-class. C++ pertama kali dikembangkan oleh Bjarne Stroustrup.",
            "C# adalah bahasa pemrograman yang dikembangkan oleh Microsoft. C# ini menggabungkan prinsip dari C dan C++. C# ini banyak digunakan untuk mengembangkan software yang menggunakan platform Windows.",
            "PHP (PHP Hypertext Pre-processor) merupakan bahasa pemrograman yang paling banyak digunakan di Indonesia. Selain karena gratis, PHP banyak digunakan karena bahasa pemrograman ini merupakan server side scripting yang memang dirancang untuk membangun website dinamis. Selain itu banyak website-website ternama seperti Facebook, Wordpress, ataupun Digg yang menggunakan PHP dalam pengembangannya. PHP pertama kali dikembangkan oleh Rasmus Lerdrorf.",
            "Visual Basic merupakan bahasa pemrograman yang dikembangkan oleh Microsoft. Bahasa pemrograman ini menawarkan IDE visual dalam pembuatan software, dan bahasa pemrograman ini dikembangkan untuk membuat software-software berbasis sistem operasi Windows. basic sendiri adalah keturunan dari bahasa pemrograman BASIC.",
            "Dalam tingkatan bahasa pemrograman, Python termasuk bahasa tingkat tinggi. Python menjadi salah satu bahasa pemrograman yang dapat membangun aplikasi, baik itu berbasis web ataupun berbasis mobile. Bahasa phyton ini termasuk kedalam bahasa pemorgraman yang cukup mudah bagi pemula, karena bahasa tersebut mudah untuk dibaca dengan syntax yang mudah untuk dipahami juga. Banyak perusahaan besar menggunanakn Phyton dalam pengembanganya seperti Instagram, Pinterest dan Rdio. Python juga digunakan oleh para pengembang Google, Yahoo!, dan juga NASA.",
            "JavaScript adalah bahasa pemrograma yang dikembangkan oleh Netscape. Penggunaan JavaScript saat ini kebanyakan terdapat pada pengembangan web. Dengan JavaScript ini kita bisa membuat web yang interaktif dan menarik. Di Indonesia sendiri terdapat grup Facebook yang membahas tentang JavaScript ini dengan nama JavaScript Indonesia. Grup yang beranggotakan lebih dari 10 ribu orang ini masih aktif sampai sekarang.",
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia. Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada. Tim Pengembang memutuskan menamakannya Kotlin dengan mengambil nama dari sebuah pulau di Rusia, sebagaimana Java yang mengambil nama dari pulau Jawa di Indonesia. Setelah Google mengumumkan bahwa Kotlin menjadi bahasa kelas satu bagi Android, maka bersama Java dan C++, Kotlin menjadi bahasa resmi untuk pengembangan aplikasi-aplikasi Android",
            "Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek. Tujuan dari ruby adalah menggabungkan kelebihan dari semua bahasa-bahasa pemrograman skrip yang ada di dunia. Ruby ditulis dengan bahasa pemrograman C dengan kemampuan dasar seperti Perl dan Python."

    };

    private static int[] languagesImages = {
            R.drawable.java,
            R.drawable.imgc,
            R.drawable.cplus,
            R.drawable.cs,
            R.drawable.php,
            R.drawable.basic,
            R.drawable.phyton,
            R.drawable.javascript,
            R.drawable.kotlin,
            R.drawable.ruby
    };

    public static ArrayList<Language> getListData(){
        ArrayList<Language> list = new ArrayList<>();
        for (int position = 0; position < languageName.length; position++){
            Language language = new Language();
            language.setName(languageName[position]);
            language.setDetail(languageDetails[position]);
            language.setPhoto(languagesImages[position]);
            list.add(language);
        }
        return list;
    }

}
