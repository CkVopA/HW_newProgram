package ru.skvortsov.gb.soft_architecture.lesson1.InMemoryModel;

public interface IModelChanger {

    void notifyChange (IModelChanger sender);
}
