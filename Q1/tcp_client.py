
import socket
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(("127.0.0.1", 5000))
reg = input("Enter register number: ")
client.send(reg.encode())
print("Result:", client.recv(1024).decode())
client.close()
