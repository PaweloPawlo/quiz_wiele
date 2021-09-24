package com.example.quiz_wiele;

public class WszystkiePytania {
    public Pytanie wszystkiePytania[] = new Pytanie[]{
            new Pytanie(R.string.p1, new int[]{R.string.p1odp_a, R.string.p1odp_b,R.string.p1odp_c}, new boolean[]{false,false,true}),
            new Pytanie(R.string.p2, new int[]{R.string.p2odp_a, R.string.p2odp_b,R.string.p2odp_c}, new boolean[]{false,true,true}),
            new Pytanie(R.string.p3, new int[]{R.string.p3odp_a, R.string.p3odp_b,R.string.p3odp_c}, new boolean[]{true,false,true}),
    };

}
