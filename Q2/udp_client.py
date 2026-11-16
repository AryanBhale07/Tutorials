
import socket
client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
while True:
    temp = input("Enter temperature (or q to quit): ")
    if temp.lower() == "q":
        break
    client.sendto(temp.encode(), ("127.0.0.1", 5001))
client.close()
