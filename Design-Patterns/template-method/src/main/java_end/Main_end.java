public class Main {
    public static void main(String[] args) {
        OrcsAI teamOrc = new OrcsAI();
        ElvesAI teamElf = new ElvesAI();

        teamOrc.takeTurn(teamElf);
        teamElf.takeTurn(teamOrc);
        teamOrc.takeTurn(teamElf);
        teamElf.takeTurn(teamOrc);
        teamOrc.takeTurn(teamElf);
        teamElf.takeTurn(teamOrc);
        teamOrc.takeTurn(teamElf);
        teamElf.takeTurn(teamOrc);
        teamOrc.takeTurn(teamElf);
        teamElf.takeTurn(teamOrc);

    }
}
