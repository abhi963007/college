import numpy as np
A = np.array([[1, 2],[3, 4]])
print(A)
U,s,VT=np.linalg.svd(A)
print("Left Singular Matrix")
print(U)
print("Singular Matrix")
print(s)
print("Right Singular Matrix")
print(VT)
print(A.shape)
Sigma = np.zeros((A.shape[0], A.shape[1]))
print(Sigma)
np.fill_diagonal(Sigma, s)
print(Sigma)
B = U.dot(Sigma.dot(VT))
print("Reconstructed Matrix:\n",B)