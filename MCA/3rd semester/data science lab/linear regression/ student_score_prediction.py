import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_absolute_error, mean_squared_error, r2_score

# Load the dataset
student = pd.read_csv('student_scores.csv')

# Prepare the data
X = student.iloc[:, 0].values.reshape(-1, 1)  # Hours studied
y = student.iloc[:, 1].values  # Scores

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Initialize the Linear Regression model
model = LinearRegression()

# Train the model on the training data
model.fit(X_train, y_train)

# Predict the target values for the test data
y_pred = model.predict(X_test)

# Evaluate the model
mae = mean_absolute_error(y_test, y_pred)
mse = mean_squared_error(y_test, y_pred)
rmse = np.sqrt(mse)
r2 = r2_score(y_test, y_pred)

# Print evaluation metrics
print(f"Mean Absolute Error: {mae}")
print(f"Mean Squared Error: {mse}")
print(f"Root Mean Squared Error: {rmse}")
print(f"R² Score: {r2}")

# Plot the results
plt.figure(figsize=(10, 5))

# Scatter plot and regression line
plt.subplot(1, 2, 1)
plt.scatter(X, y, color='blue', label='Data points')
plt.plot(X, model.predict(X), color='red', label='Regression Line')
plt.title('Simple Linear Regression')
plt.xlabel('Hours Studied')
plt.ylabel('Scores')
plt.legend()
plt.grid()

# Bar chart for actual vs predicted values
plt.subplot(1, 2, 2)
X_axis = np.arange(len(y_test))
plt.bar(X_axis - 0.2, y_test, 0.4, label='Actual', color='blue')
plt.bar(X_axis + 0.2, y_pred, 0.4, label='Predicted', color='orange')
plt.xlabel("Test Records")
plt.ylabel("Marks")
plt.title("Student Score Prediction")
plt.legend()

plt.tight_layout()
plt.show()

# Residuals plot
residuals = y_test - y_pred
plt.figure(figsize=(6, 4))
plt.scatter(y_pred, residuals)
plt.axhline(0, color='red', linestyle='--')
plt.xlabel('Predicted Values')
plt.ylabel('Residuals')
plt.title('Residual Plot')
plt.grid()
plt.show()
