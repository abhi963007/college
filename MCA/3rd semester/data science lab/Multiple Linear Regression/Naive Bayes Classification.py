import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import accuracy_score

# Load the dataset
dataset = pd.read_csv('iris.csv')
X = dataset.iloc[:, :4].values
y = dataset['variety'].values

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Train and test the Gaussian Naive Bayes model
classifier = GaussianNB()
classifier.fit(X_train, y_train)
y_pred = classifier.predict(X_test)
print(f"Predicted values: {y_pred}")

# Evaluate the model's accuracy
accuracy = accuracy_score(y_test, y_pred)
print(f"Accuracy: {accuracy}")

# Count and display mislabeled instances
mislabeled_count = (y_test != y_pred).sum()
print(f"Number of mislabeled points: {mislabeled_count} out of {len(y_test)}")

mismatches = (y_test != y_pred)
print("Mismatching records (Actual vs Predicted):")
for actual, predicted in zip(y_test[mismatches], y_pred[mismatches]):
    print(f"Actual: {actual}, Predicted: {predicted}")
