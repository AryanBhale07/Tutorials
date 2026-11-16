
import socket
server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server.bind(("127.0.0.1", 5001))
print("Waiting for temperature readings...")
while True:
    data, address = server.recvfrom(1024)
    print("Temperature received:", data.decode())
