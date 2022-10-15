package ru.skvortsov.gb.soft_architecture.lesson1.InMemoryModel;

import ru.skvortsov.gb.soft_architecture.lesson1.ModelElements.Camera;
import ru.skvortsov.gb.soft_architecture.lesson1.ModelElements.Flash;
import ru.skvortsov.gb.soft_architecture.lesson1.ModelElements.PoligonalModel;
import ru.skvortsov.gb.soft_architecture.lesson1.ModelElements.Scene;

public class ModelStore implements IModelChanger{

    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangedObserver changedObserver;

    public Scene getScenes(int amount) {
        return scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        System.out.println("Я пока не знаю, что должен делать этот метод");
    }
}
