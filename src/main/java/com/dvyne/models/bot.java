package com.dvyne.models;

import com.dvyne.enums.DifficultyLevel;

public class bot extends player {
    private DifficultyLevel difficultyLevel;

   
    public bot(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    
    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    
    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }


}
