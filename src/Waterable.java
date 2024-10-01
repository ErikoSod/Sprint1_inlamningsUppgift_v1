interface Waterable  {

    /*
    Interfacet Waterable har två metodkrav för de klasser som iplementerar det.
    getWatering är definerade i klasserna som implemmenterar interfacet.
    getName ärvs av superklassen Plant och därför också uppfyller
    kravet för interface implementationen.
    */

    String getWatering();
    String getName();

}
