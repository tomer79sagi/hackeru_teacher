package _passover_project.part_2.util;

import _passover_project.part_2.team.Player;

public interface IAdvancedSort
    extends IBasicSort {

    public Player[] sortByTeamPoints();

    public Player[] sortByTeamFGPCT();
}
