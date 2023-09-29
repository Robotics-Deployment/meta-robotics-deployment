import unittest
from oeqa.runtime.case import OERuntimeTestCase
from oeqa.runtime.decorator.package import OEHasPackage

class TestRoboticsDeployment(OERuntimeTestCase):

    @OEHasPackage(['iputils'])
    def test_ping(self):
        status, output = self.target.run('ping -c 4 1.1.1.1')
        self.assertEqual(status, 0, msg="Ping test failed: %s" % output)

    @OEHasPackage(['docker'])
    def test_docker_hello_world(self):
        status, output = self.target.run('docker run hello-world')
        self.assertEqual(status, 0, msg="Docker hello-world test failed: %s" % output)

if __name__ == '__main__':
    unittest.main()